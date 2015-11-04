package com.koombea.mvpsample.domain.interactor;

import com.koombea.mvpsample.domain.executor.PostExecutionThread;
import com.koombea.mvpsample.domain.executor.ThreadExecutor;
import com.koombea.mvpsample.domain.repository.ItemRepository;

import rx.Observable;

/**
 * Created by koombea on 11/4/15.
 */
public class GetItemList extends UseCase {

        private final ItemRepository userRepository;

        public GetItemList(ItemRepository userRepository, ThreadExecutor threadExecutor,
                PostExecutionThread postExecutionThread) {
            super(threadExecutor, postExecutionThread);
            this.userRepository = userRepository;
        }

        @Override public Observable buildUseCaseObservable() {
            return this.userRepository.items();
        }
}

