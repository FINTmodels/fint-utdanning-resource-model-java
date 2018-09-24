// Built from tag v3.1.0

package no.fint.model.resource.utdanning.elev;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.Collection;
import java.util.List;

import lombok.NoArgsConstructor;
import no.fint.model.resource.AbstractCollectionResources;

@NoArgsConstructor
public class ElevResources extends AbstractCollectionResources<ElevResource> {

    public ElevResources(Collection<ElevResource> input) {
        super(input);
    }

    @JsonIgnore
    @Deprecated
    @Override
    public TypeReference<List<ElevResource>> getTypeReference() {
        return new TypeReference<List<ElevResource>>() {};
    }
}
