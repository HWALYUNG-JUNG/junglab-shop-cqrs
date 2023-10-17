package junglabshopcqrs.domain;

import java.time.LocalDate;
import java.util.*;
import junglabshopcqrs.infra.AbstractEvent;
import lombok.Data;

@Data
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private String address;
    private String customerId;
    private Integer quantity;
    private Long orderId;
}
