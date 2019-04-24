package producers;

import javax.enterprise.inject.Produces;
import java.util.Date;

public class DateProducer {
    @Produces
    private Date date = new Date();
}
