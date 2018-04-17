// Built from tag v2.7.0

package no.fint.model.resource.utdanning.utdanningsprogram;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

import no.fint.model.resource.AbstractCollectionResources;

public class SkoleResources extends AbstractCollectionResources<SkoleResource> {

    @Override
    public TypeReference<List<SkoleResource>> getTypeReference() {
        return new TypeReference<List<SkoleResource>>() {};
    }
}
