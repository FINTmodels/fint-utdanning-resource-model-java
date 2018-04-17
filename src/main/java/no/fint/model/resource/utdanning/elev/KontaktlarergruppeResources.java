// Built from tag v2.7.0

package no.fint.model.resource.utdanning.elev;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

import no.fint.model.resource.AbstractCollectionResources;

public class KontaktlarergruppeResources extends AbstractCollectionResources<KontaktlarergruppeResource> {

    @Override
    public TypeReference<List<KontaktlarergruppeResource>> getTypeReference() {
        return new TypeReference<List<KontaktlarergruppeResource>>() {};
    }
}
