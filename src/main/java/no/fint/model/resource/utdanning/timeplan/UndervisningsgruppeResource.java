// Built from tag v2.7.0

package no.fint.model.resource.utdanning.timeplan;

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
import no.fint.model.utdanning.basisklasser.Gruppe;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class UndervisningsgruppeResource extends Gruppe implements FintMainObject, FintLinks {

    // Relations
    @Getter
    private final Map<String, List<Link>> links = createLinks();
        
    public void addFag(Link link) {
        addLink("fag", link);
    }
    public void addTime(Link link) {
        addLink("time", link);
    }
    public void addGrepreferanse(Link link) {
        addLink("grepreferanse", link);
    }
    public void addVigoreferanse(Link link) {
        addLink("vigoreferanse", link);
    }
    public void addMedlemskap(Link link) {
        addLink("medlemskap", link);
    }
}
