// Built from tag v3.0.0

package no.fint.model.resource.utdanning.elev;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

import no.fint.model.resource.AbstractCollectionResources;

public class BasisgruppeResources extends AbstractCollectionResources<BasisgruppeResource> {

    @Override
    public TypeReference<List<BasisgruppeResource>> getTypeReference() {
        return new TypeReference<List<BasisgruppeResource>>() {};
    }
}
