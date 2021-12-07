package movieapp.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
@Builder
public class MovieDetailDirectorActors extends MovieDetail {
	@Getter @Setter private ArtistSimple director;
	@Getter @Setter private List<ArtistSimple> actors;
}
