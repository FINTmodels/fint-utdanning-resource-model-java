// Built from tag v2.7.0

package no.fint.model.resource.utdanning.timeplan;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

import no.fint.model.resource.AbstractCollectionResources;

public class UndervisningsgruppeResources extends AbstractCollectionResources<UndervisningsgruppeResource> {

    @Override
    public TypeReference<List<UndervisningsgruppeResource>> getTypeReference() {
        return new TypeReference<List<UndervisningsgruppeResource>>() {};
    }
}
