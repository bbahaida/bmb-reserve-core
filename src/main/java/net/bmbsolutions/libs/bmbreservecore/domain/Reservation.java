package net.bmbsolutions.libs.bmbreservecore.domain;

import lombok.*;
import net.bmbsolutions.libs.bmbreservecore.enums.Status;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Builder
public class Reservation {
    private Long id;
    @NonNull
    private String userId;
    private Slot slot;
    private Status status;
    private List<AdditionalAttribute> attributes;

}
