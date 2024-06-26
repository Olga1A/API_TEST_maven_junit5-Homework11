package dto;

public class TestOrderDto {

    String status;
    int courierId;
    String customerName;
    String customerPhone;
    String comment;
    long id;

    public String getStatus() {
        return status;
    }

    public int getCourierId() {
        return courierId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public String getComment() {
        return comment;
    }

    public long getId() {
        return id;
    }

    public TestOrderDto(String customerName, String customerPhone, String comment) {
        this.status = "OPEN";
        this.courierId = 0;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.comment = comment;
        this.id = 0;
    }

    public TestOrderDto() {
        this.status = "OPEN";
        this.courierId = 0;
        this.id = 0;
    }

    // setters methods


    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
