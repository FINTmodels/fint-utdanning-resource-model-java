// Built from tag v3.0.0

package no.fint.model.resource.utdanning.timeplan;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

import no.fint.model.resource.AbstractCollectionResources;

public class TimeResources extends AbstractCollectionResources<TimeResource> {

    @Override
    public TypeReference<List<TimeResource>> getTypeReference() {
        return new TypeReference<List<TimeResource>>() {};
    }
}
