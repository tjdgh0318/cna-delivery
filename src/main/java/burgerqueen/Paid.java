
package burgerqueen;

public class Paid extends AbstractEvent {

    private Long id;
    private Long orderId;
    // 주석 추가

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
}
