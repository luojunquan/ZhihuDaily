package com.baiiu.zhihudaily.util.net;

import com.baiiu.zhihudaily.newsDetail.model.DailyDetail;
import com.baiiu.zhihudaily.newsList.model.Daily;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * author: baiiu
 * date: on 16/5/16 14:40
 * description:
 *
 * github的API
 *
 * baiiu is an example user.
 */
public interface DailyAPI {

    @GET("news/latest") Observable<Daily> newsLatest();

    @GET("news/before/{date}") Observable<Daily> newsBefore(@Path("date") String date);

    @GET("news/{id}") Observable<DailyDetail> newsDetail(@Path("id") long id);
}
