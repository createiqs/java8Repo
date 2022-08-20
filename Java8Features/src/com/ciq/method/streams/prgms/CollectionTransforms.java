package com.ciq.method.streams.prgms;

import java.util.Collection;
import java.util.function.Supplier;

public class CollectionTransforms {

	public static <T, DEST extends Collection<T>, SOURCE extends Collection<T>> DEST transform(SOURCE sourceCollection,
			Supplier<DEST> creator) {
		DEST destinationCollection = creator.get();
		destinationCollection.addAll(sourceCollection);
		return destinationCollection;

	}
}
