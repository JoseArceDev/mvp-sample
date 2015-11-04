package com.koombea.mvpsample.domain.repository;

import com.koombea.mvpsample.model.ItemModel;

import java.util.List;

import rx.Observable;

/**
 * Created by koombea on 11/4/15.
 */
public interface ItemRepository {

    /**
     * Get an {@link rx.Observable} which will emit a List of {@link ItemModel}.
     */
    Observable<List<ItemModel>> items();


    /**
     * Get an {@link rx.Observable} which will emit a {@link ItemModel}.
     *
     * @param itemId The user id used to retrieve user data.
     */
    Observable<ItemModel> user(final int itemId);
}
