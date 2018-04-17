// Built from tag v2.7.0

package no.fint.model.resource.utdanning.timeplan;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

import no.fint.model.resource.AbstractCollectionResources;

public class FagResources extends AbstractCollectionResources<FagResource> {

    @Override
    public TypeReference<List<FagResource>> getTypeReference() {
        return new TypeReference<List<FagResource>>() {};
    }
}
