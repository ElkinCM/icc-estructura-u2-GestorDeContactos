package Model;
public class Contact {

    private String name;
    private String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    
    

    public Contact(String name) {
        this.name = name;
    }
    public Contact() {
    }


    @Override
    public String toString() {
        return "Contact [name=" + name + ", phone=" + phone + "]";
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getPhone() {
        return phone;
    }


    public void setPhone(String phone) {
        this.phone = phone;
    }


@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null || getClass() != obj.getClass())
        return false;
    Contact other = (Contact) obj;
    if (name == null) {
        if (other.name != null)
            return false;
    } else if (!name.equals(other.name))
        return false;

    if (phone == null) {
        if (other.phone != null)
            return false;
    } else if (!phone.equals(other.phone))
        return false;

    return true;
}

@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + ((phone == null) ? 0 : phone.hashCode());
    return result;
}

    
}