package net.schooldroid.stool.Juknis;

import android.app.Activity;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.annotation.RawRes;
import android.util.Log;

import net.schooldroid.stool.STool;

import org.jsoup.helper.StringUtil;

import java.util.Comparator;
import java.util.regex.Pattern;

public class ModelJuknis {
    public String kategori;
    public String header;
    public String content;
    public String urut;
    public Class<?> linkToActivity = null;
    public @RawRes @DrawableRes @Nullable Integer resourceId = null;
    public int imageWidth = 0;
    public int imageHeight = 0;

    String kategoriSubJuknis = "";

    public ModelJuknis(){

    }


    public ModelJuknis (String kategori, String header, String content, String urut, Class<?> linkToActivity) {
        this.kategori = kategori;
        this.header = header;
        this.content = STool.changeContentToHtml(content);
        this.urut = urut;
        this.linkToActivity = linkToActivity;
    }

    public ModelJuknis (String kategori, String header, String content, String urut, Class<?> linkToActivity, @Nullable Integer imageResourceId, int imageWidth, int imageHeight) {
        this.kategori = kategori;
        this.header = header;
        this.content = STool.changeContentToHtml(content);
        this.urut = urut;
        this.linkToActivity = linkToActivity;
        this.resourceId = imageResourceId;
        this.imageWidth = imageWidth;
        this.imageHeight = imageHeight;
    }







    public static Comparator<ModelJuknis> Sort = new Comparator<ModelJuknis>() {
        @Override
        public int compare(ModelJuknis o1, ModelJuknis o2) {
            String urut1 = o1.urut.replace(".",""); String urut2 = o2.urut.replace(".","");
            return Integer.parseInt(urut1) - Integer.parseInt(urut2);
        }
    };

}