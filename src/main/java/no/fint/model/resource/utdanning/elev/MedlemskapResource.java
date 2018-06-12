// Built from tag v3.0.0

package no.fint.model.resource.utdanning.elev;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

import java.util.Collections;
import java.util.List;
import java.util.Map;

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
        

    @JsonIgnore
    public List<Link> getMedlem() {
        return getLinks().getOrDefault("medlem", Collections.emptyList()); 
    }
    public void addMedlem(Link link) {
        addLink("medlem", link);
    }

    @JsonIgnore
    public List<Link> getFortlopendeVurdering() {
        return getLinks().getOrDefault("fortlopendeVurdering", Collections.emptyList()); 
    }
    public void addFortlopendeVurdering(Link link) {
        addLink("fortlopendeVurdering", link);
    }

    @JsonIgnore
    public List<Link> getGruppe() {
        return getLinks().getOrDefault("gruppe", Collections.emptyList()); 
    }
    public void addGruppe(Link link) {
        addLink("gruppe", link);
    }

    @JsonIgnore
    public List<Link> getEndeligVurdering() {
        return getLinks().getOrDefault("endeligVurdering", Collections.emptyList()); 
    }
    public void addEndeligVurdering(Link link) {
        addLink("endeligVurdering", link);
    }

    @JsonIgnore
    public List<Link> getFravar() {
        return getLinks().getOrDefault("fravar", Collections.emptyList()); 
    }
    public void addFravar(Link link) {
        addLink("fravar", link);
    }
}
