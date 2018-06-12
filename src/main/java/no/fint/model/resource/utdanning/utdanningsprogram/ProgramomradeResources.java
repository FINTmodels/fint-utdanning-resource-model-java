// Built from tag v3.0.0

package no.fint.model.resource.utdanning.utdanningsprogram;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

import no.fint.model.resource.AbstractCollectionResources;

public class ProgramomradeResources extends AbstractCollectionResources<ProgramomradeResource> {

    @Override
    public TypeReference<List<ProgramomradeResource>> getTypeReference() {
        return new TypeReference<List<ProgramomradeResource>>() {};
    }
}
