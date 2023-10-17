package junglabshopcqrs.domain;

import java.util.*;
import junglabshopcqrs.domain.*;
import junglabshopcqrs.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String productId;
    private Integer qty;
    private String customerId;
    private Double amount;
    private String status;
    private String address;
}
