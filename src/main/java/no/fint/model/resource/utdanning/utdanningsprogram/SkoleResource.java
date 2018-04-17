// Built from tag v2.7.0

package no.fint.model.resource.utdanning.utdanningsprogram;

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
import no.fint.model.resource.felles.basisklasser.EnhetResource;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class SkoleResource extends EnhetResource implements FintMainObject, FintLinks {
    // Attributes
    private String domenenavn;
    private String juridiskNavn;
    @NonNull
    private String navn;
    @NonNull
    private Identifikator skolenummer;
    @NonNull
    private Identifikator systemId;

    // Relations
    @Getter
    private final Map<String, List<Link>> links = createLinks();
        
    public void addOrganisasjon(Link link) {
        addLink("organisasjon", link);
    }
    public void addFag(Link link) {
        addLink("fag", link);
    }
    public void addSkoleeierType(Link link) {
        addLink("skoleeierType", link);
    }
    public void addVigoreferanse(Link link) {
        addLink("vigoreferanse", link);
    }
    public void addUtdanningsprogram(Link link) {
        addLink("utdanningsprogram", link);
    }
    public void addUtdanningsforhold(Link link) {
        addLink("utdanningsforhold", link);
    }
}
