// Built from tag v2.7.0

package no.fint.model.resource.utdanning.kompleksedatatyper;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

import no.fint.model.resource.AbstractCollectionResources;

public class VurderingResources extends AbstractCollectionResources<VurderingResource> {

    @Override
    public TypeReference<List<VurderingResource>> getTypeReference() {
        return new TypeReference<List<VurderingResource>>() {};
    }
}
