// Built from tag v3.0.0

package no.fint.model.resource.utdanning.kodeverk;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

import no.fint.model.resource.AbstractCollectionResources;

public class KarakterskalaResources extends AbstractCollectionResources<KarakterskalaResource> {

    @Override
    public TypeReference<List<KarakterskalaResource>> getTypeReference() {
        return new TypeReference<List<KarakterskalaResource>>() {};
    }
}
