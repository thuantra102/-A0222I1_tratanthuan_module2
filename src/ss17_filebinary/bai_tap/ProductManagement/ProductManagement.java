package ss17_filebinary.bai_tap.ProductManagement;

import ss17_filebinary.thuc_hanh.WriteStudent.Student;

import java.io.*;
import java.util.*;



public class ProductManagement {
    private static final String filePath = "D:\\CODEGYM\\A0222I1_tratanthuan_module2\\src\\ss17_filebinary\\bai_tap\\ProductManagement\\data.bin";
    public List<Product> productList  = new ArrayList<>();
    public List<Product>  readList = new ArrayList<>();

//    public ProductManagement()  {
//
//         try {
//            File file = new File(filePath);
//            if(!file.exists()) {
//                file.createNewFile();
//
//            }
//            if(file.length() >0) {
//                ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath));
//                productList = (ArrayList) objectInputStream.readObject();
//            }
//
//            this.objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath));
//        }
//
//        catch (IOException e ) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }


    public ProductManagement() throws IOException {

    }


    
    public void addProduct(Product newProduct) throws IOException {
        int lastIndex = this.productList.size()-1;
        if(this.productList.size()==0) {
            newProduct.setId(1);
        } else  {
            int lastId = this.productList.get(lastIndex).getId();
            newProduct.setId(lastId +1);
        }
        productList.add(newProduct);

    }

    public void searchByName(String name){
        Optional<Product> searchingProduct = productList.stream()
                .filter(product -> product.getName().equals(name))
                .findFirst();
        if(searchingProduct.isPresent()) {
            System.out.println(searchingProduct.get().toString());
        }

    }
    public  List<Product> readDataFromFile() throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath));
        objectOutputStream.writeObject(productList);
        objectOutputStream.close();
        List<Product> readData = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            readData = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return readData;
    }
    public void displayList() {
        productList.forEach(System.out::println);
    }
}
