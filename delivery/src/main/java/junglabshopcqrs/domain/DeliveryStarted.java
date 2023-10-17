package junglabshopcqrs.domain;

import junglabshopcqrs.domain.*;
import junglabshopcqrs.infra.AbstractEvent;
import java.util.*;
import lombok.*;
import java.time.LocalDate;


//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private String address;
    private String customerId;
    private Integer quantity;
    private Long orderId;

    public DeliveryStarted( aggregate){
        super(aggregate);
    }
    public DeliveryStarted(){
        super();
    }
}
//>>> DDD / Domain Event