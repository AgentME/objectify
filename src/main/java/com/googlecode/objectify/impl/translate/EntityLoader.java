package com.googlecode.objectify.impl.translate;

import com.google.appengine.api.datastore.Entity;

public interface EntityLoader<T> {
	T load(Entity n);
}
