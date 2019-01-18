package de.thro.inf.prg3.a12.icndb;

import de.thro.inf.prg3.a12.icndb.suppliers.AllJokesSupplier;
import de.thro.inf.prg3.a12.icndb.suppliers.RandomJokeSupplier;
import de.thro.inf.prg3.a12.model.JokeDto;
import de.thro.inf.prg3.a12.model.ResponseWrapper;

import java.util.stream.Stream;

/**
 * Generator instance to provide streams of jokes
 *
 * @author Peter Kurfer
 */

public final class JokeGenerator {

	/**
	 * Generator for random jokes
	 *
	 * @return stream of random jokes wrapped in ResponseWrapper objects
	 */
	public Stream<ResponseWrapper<JokeDto>> randomJokesStream() {
		return Stream.generate(new RandomJokeSupplier());
	}

	/**
	 * Generator for jokes ordered by their id
	 *
	 * @return stream of jokes wrapped in ResponseWrapper objects
	 */
	public Stream<ResponseWrapper<JokeDto>> jokesStream() {
		return Stream.generate(new AllJokesSupplier());
	}
}
