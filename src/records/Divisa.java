package records;

import java.util.Map;

public record Divisa(String result,
                     String time_last_update_utc,
                     String time_next_update_utc,
                     String base_code,
                     double conversion_rate) {
}
