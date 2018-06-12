// Built from tag v3.0.0

package no.fint.model.resource.utdanning.vurdering;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

import no.fint.model.resource.AbstractCollectionResources;

public class VurderingResources extends AbstractCollectionResources<VurderingResource> {

    @Override
    public TypeReference<List<VurderingResource>> getTypeReference() {
        return new TypeReference<List<VurderingResource>>() {};
    }
}
