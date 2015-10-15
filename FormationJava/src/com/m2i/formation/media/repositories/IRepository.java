package com.m2i.formation.media.repositories;

import java.io.IOException;
import java.util.*;

import com.m2i.formation.media.entities.IEntity;
import com.m2i.formation.media.entities.MediaException;

public interface IRepository <T extends IEntity> {

		String getUri();
		void setUri(String uri);
		List<T> getAll() throws IOException, MediaException;
		T getById(int id)throws IOException, MediaException;
		List<T> getByPrice(double price)throws IOException, MediaException;
		List<T> getByTitle (String word)throws IOException, MediaException;
}
