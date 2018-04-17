// Built from tag v2.7.0

package no.fint.model.resource.utdanning.elev;

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

import no.fint.model.FintMainObject;
import no.fint.model.resource.FintLinks;
import no.fint.model.resource.Link;
import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class MedlemskapResource implements FintMainObject, FintLinks {
    // Attributes
    @NonNull
    private Identifikator systemId;

    // Relations
    @Getter
    private final Map<String, List<Link>> links = createLinks();
        
    public void addMedlem(Link link) {
        addLink("medlem", link);
    }
    public void addFortlopendeVurdering(Link link) {
        addLink("fortlopendeVurdering", link);
    }
    public void addGruppe(Link link) {
        addLink("gruppe", link);
    }
    public void addEndeligVurdering(Link link) {
        addLink("endeligVurdering", link);
    }
    public void addFravar(Link link) {
        addLink("fravar", link);
    }
}
