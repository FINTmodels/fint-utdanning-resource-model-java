// Built from tag v2.7.0

package no.fint.model.resource.utdanning.kompleksedatatyper;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import no.fint.model.FintComplexDatatypeObject;
import no.fint.model.resource.FintLinks;
import no.fint.model.resource.Link;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class VurderingResource implements FintComplexDatatypeObject, FintLinks {
    // Attributes
    @NonNull
    private String kommentar;

    // Relations
    @Getter
    private final Map<String, List<Link>> links = createLinks();
        
    public void addKarakter(Link link) {
        addLink("karakter", link);
    }
}
