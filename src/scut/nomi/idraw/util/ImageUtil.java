package scut.nomi.idraw.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


import scut.nomi.idraw.R;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.util.Log;

public class ImageUtil
{
	public static List<Integer> getImageValues()
	{
		try
		{
			// �õ�R.drawable���е�����, ����ȡdrawableĿ¼�µ�����ͼƬ
			Field[] drawableFields = R.drawable.class.getFields();
			List<Integer> resourceValues = new ArrayList<Integer>();
			for (Field field : drawableFields)
			{
				// �����Field��������p_��ͷ
				if (field.getName().indexOf("board_") != -1)
				{
					resourceValues.add(field.getInt(R.drawable.class));
				}
			}
			return resourceValues;
		} catch (Exception e) {
			return null;
		}
	}

	
}
