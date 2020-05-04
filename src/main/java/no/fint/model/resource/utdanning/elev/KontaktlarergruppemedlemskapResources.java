// Built from tag v3.5.0-rc-1

package no.fint.model.resource.utdanning.elev;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.Collection;
import java.util.List;

import lombok.NoArgsConstructor;
import no.fint.model.resource.AbstractCollectionResources;

@NoArgsConstructor
public class KontaktlarergruppemedlemskapResources extends AbstractCollectionResources<KontaktlarergruppemedlemskapResource> {

    public KontaktlarergruppemedlemskapResources(Collection<KontaktlarergruppemedlemskapResource> input) {
        super(input);
    }

    @JsonIgnore
    @Deprecated
    @Override
    public TypeReference<List<KontaktlarergruppemedlemskapResource>> getTypeReference() {
        return new TypeReference<List<KontaktlarergruppemedlemskapResource>>() {};
    }
}
