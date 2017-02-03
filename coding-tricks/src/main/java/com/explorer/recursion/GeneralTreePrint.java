package com.explorer.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GeneralTreePrint {

	public static class Movie {

		@Override
		public String toString() {
			return "Movie [id=" + id + ", rating=" + rating + "]";
		}

		private int id;
		private float rating;
		private List<Movie> relatedMovies;

		public Movie(int id, float rating) {
			this.id = id;
			this.rating = rating;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public float getRating() {
			return rating;
		}

		public void setRating(float rating) {
			this.rating = rating;
		}

		public List<Movie> getRelatedMovies() {
			return relatedMovies;
		}

		public void setRelatedMovies(List<Movie> relatedMovies) {
			this.relatedMovies = relatedMovies;
		}

	}

	public static void main(String[] args) {
		Movie root = getMovieTree();
		Set<Movie> movies = recursivePrinter(root, new HashSet<Movie>());
		for(Movie m : movies){
			System.out.println(m);
		}
	}

	public static Set<Movie> recursivePrinter(Movie movie, Set<Movie> allmovies) {
		allmovies.add(movie);
		if(movie.getRelatedMovies() != null)
		for(Movie m : movie.getRelatedMovies()){
			if(m!=null && !allmovies.contains(m))
				allmovies.addAll(recursivePrinter(m, allmovies));
		}
		return allmovies;
	}

	public static Movie getMovieTree() {
		Movie m = new Movie(0, 5.1f);
		Movie m1 = new Movie(1, 5.1f);
		Movie m2 = new Movie(2, 5.2f);
		Movie m3 = new Movie(3, 5.3f);
		Movie m4 = new Movie(4, 5.4f);
		Movie m5 = new Movie(5, 5.5f);
		Movie m6 = new Movie(6, 5.6f);
		Movie m7 = new Movie(7, 5.7f);
		Movie m8 = new Movie(8, 5.8f);
		Movie m9 = new Movie(9, 5.9f);
		m.setRelatedMovies(Arrays.asList(m1, m2, m3));
		m1.setRelatedMovies(Arrays.asList(m4, m5, m2));
		m2.setRelatedMovies(Arrays.asList(m7, m1));
		return m;
	}

}
