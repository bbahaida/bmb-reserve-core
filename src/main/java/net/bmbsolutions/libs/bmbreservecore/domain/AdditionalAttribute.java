package net.bmbsolutions.libs.bmbreservecore.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AdditionalAttribute {
    private Long id;
    private String name;
    private String value;
}