// Built from tag v3.0.0-rc-1

package no.fint.model.resource.utdanning.utdanningsprogram;

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
        
    @JsonIgnore
    public List<Link> getOrganisasjon() {
        return getLinks().getOrDefault("organisasjon", Collections.emptyList()); 
    }
    public void addOrganisasjon(Link link) {
        addLink("organisasjon", link);
    }
    @JsonIgnore
    public List<Link> getFag() {
        return getLinks().getOrDefault("fag", Collections.emptyList()); 
    }
    public void addFag(Link link) {
        addLink("fag", link);
    }
    @JsonIgnore
    public List<Link> getSkoleeierType() {
        return getLinks().getOrDefault("skoleeierType", Collections.emptyList()); 
    }
    public void addSkoleeierType(Link link) {
        addLink("skoleeierType", link);
    }
    @JsonIgnore
    public List<Link> getVigoreferanse() {
        return getLinks().getOrDefault("vigoreferanse", Collections.emptyList()); 
    }
    public void addVigoreferanse(Link link) {
        addLink("vigoreferanse", link);
    }
    @JsonIgnore
    public List<Link> getUtdanningsprogram() {
        return getLinks().getOrDefault("utdanningsprogram", Collections.emptyList()); 
    }
    public void addUtdanningsprogram(Link link) {
        addLink("utdanningsprogram", link);
    }
    @JsonIgnore
    public List<Link> getUtdanningsforhold() {
        return getLinks().getOrDefault("utdanningsforhold", Collections.emptyList()); 
    }
    public void addUtdanningsforhold(Link link) {
        addLink("utdanningsforhold", link);
    }
}
