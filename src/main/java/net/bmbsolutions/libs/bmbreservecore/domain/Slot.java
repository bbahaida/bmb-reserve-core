package net.bmbsolutions.libs.bmbreservecore.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Slot {
    private Long id;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private List<AdditionalAttribute> attributes;
}
