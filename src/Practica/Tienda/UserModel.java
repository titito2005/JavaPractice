package Practica.Tienda;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class UserModel {
    private String userName;
    private List<ProductModel> userProducts = new ArrayList<>();

    public UserModel(String userName, List<ProductModel> userProducts){
        this.userName = userName;
        this.userProducts = userProducts;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public void setUserProducts (List<ProductModel> userProducts){
        this.userProducts = userProducts;
    }

    public String getUserName () {
        return this.userName;
    }

    public List<ProductModel> getUserProducts() {
        return this.userProducts;
    }

    public void addProduct(ProductModel product) {
        this.userProducts.add(product);
    }

    public boolean removeProduct(int id){
        Iterator<ProductModel> iterator = this.userProducts.iterator();
        while (iterator.hasNext()) {
            ProductModel producto = iterator.next();
            if (producto.getId() == id) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public void showProducts(){
        if(!userProducts.isEmpty()){
            for (ProductModel product : userProducts) {
                System.out.println(product.getNombre());
            }
        } else {
            System.out.println("No hay productos");
        }

    }
}
