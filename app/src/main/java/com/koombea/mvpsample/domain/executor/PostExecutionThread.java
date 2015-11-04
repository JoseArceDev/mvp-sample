package com.koombea.mvpsample.domain.executor;

import rx.Scheduler;

/**
 * Created by koombea on 11/4/15.
 */
public interface PostExecutionThread {
    Scheduler getScheduler();
}
