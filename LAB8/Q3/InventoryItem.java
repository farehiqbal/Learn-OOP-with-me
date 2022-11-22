package LAB8.Q3;

public class InventoryItem implements Compare{
    
    String name;
    int idNumber;

    public InventoryItem() {
        this(" ", 0);
    }

    public InventoryItem(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public boolean compareObjects(Object obj){

        if(this == obj) return true;

        if(obj == null) return false;

        if(getClass() != obj.getClass()) return false;

        InventoryItem temp = (InventoryItem) obj;

        if(this.name == null){
            if(temp.name != null) return false;
            
        } else{
            if(temp.name == null) return false;
            else if(!this.name.equals(temp.name)) return false;
        }

        if(this.idNumber != temp.idNumber) return false;
        return true;
    }
    
}
