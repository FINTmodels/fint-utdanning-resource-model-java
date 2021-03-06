// Built from tag v3.5.0

package no.fint.model.resource.utdanning.basisklasser;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import no.fint.model.FintAbstractObject;
import no.fint.model.resource.FintLinks;
import no.fint.model.resource.Link;
import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public abstract class UtdanningsforholdResource implements FintAbstractObject, FintLinks {
    // Attributes
    @NonNull
    private String beskrivelse;
    @NonNull
    private Identifikator systemId;

    // Relations
    @Getter
    private final Map<String, List<Link>> links = createLinks();
}
