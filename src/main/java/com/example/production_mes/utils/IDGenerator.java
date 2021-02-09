package com.example.production_mes.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class IDGenerator
{
	private static final long ONE_STEP = 10;
	private static final long BASE = 1129703383453l;
	private static final Lock LOCK = new ReentrantLock();
	private static long lastTime4long = System.currentTimeMillis();
	private static SimpleDateFormat format = new SimpleDateFormat("yyyyMMddhhmmssSSS");
	private static long lastTime =new Long(format.format(new Date()));
	private static short lastCount = 0;
	public  static Calendar nowCalendar   = Calendar.getInstance();
	private  final long time;
	private  final short count;


	/**
	 * 构造函数初始话相应的参数
	 *
	 * @param lastTime4long
	 */
	public  IDGenerator(long lastTime4long) {
		LOCK.lock();
		try {
			if (lastCount == ONE_STEP) {
				boolean done = false;
				while (!done) {
					long now = System.currentTimeMillis();
					if (now == lastTime4long) {

						try {
							Thread.sleep(1);
						}
						catch (java.lang.InterruptedException e) {
						}
						continue;
					}
					else {
						lastTime4long = now;
						lastCount = 0;
						done = true;
					}
				}
			}
			time = lastTime4long;
			count = lastCount++;
		}
		finally {
			LOCK.unlock();
		}

	}
	public  IDGenerator() {
		LOCK.lock();
		try {
			if (lastCount == ONE_STEP) {
				boolean done = false;
				while (!done) {
					long now = new Long(format.format(new Date()));
					if (now == lastTime) {

						try {
							Thread.sleep(1);
						}
						catch (java.lang.InterruptedException e) {
						}
						continue;
					}
					else {
						lastTime = now;
						lastCount = 0;
						done = true;
					}
				}
			}
			time = lastTime;
			count = lastCount++;
		}
		finally {
			LOCK.unlock();
		}

	}

	/**
	 * 生成格式是201010151010101000的long型ID
	 *
	 * @return
	 */
//	public static String generateStringID(){
//		return generateID();
//	}
	public static long generateID(){
		IDGenerator idGenerator = new IDGenerator();
		return (idGenerator.time)+idGenerator.count;
	}

	public static long generateLongID(){
		IDGenerator idGenerator = new IDGenerator(lastTime4long);
		return (BASE+idGenerator.time)+idGenerator.count;

	}

	/**
	 *
	 *   生成格式是2010-10151010101000的字符串型ID
	 * @return
	 */
	public static String generateUUID() {
		return UUID.randomUUID().toString();
	}

	/**
	 * 生成格式是UUID字符串
	 *
	 * @return
	 */
	public static String generateIDByDateStr(){
		return (generateID()+"").replace(nowCalendar.get(Calendar.YEAR)+"", nowCalendar.get(Calendar.YEAR)+"");


	}
	public static void main (String[]args){
//	 for(int i = 0;i<30;i++){
//	  System.out.println((int)IDGenerator.generateID());
//	  System.out.println(IDGenerator.generateID());
//	 }
//	 System.out.println("------------------------------------------------");
//	 for(int i = 0;i<30;i++){
//		  System.out.println((int)IDGenerator. generateLongID());
//		  System.out.println(IDGenerator. generateLongID());
//		 }

	 System.out.println("------------------------------------------------");
	 for(int i = 0;i<30;i++){
		  System.out.println(IDGenerator.generateIDByDateStr());
		 }
		
//		for(int i = 0;i<30;i++){
////			System.out.println(IDGenerator.generateIDByDateStr());
//			System.out.println(IDGenerator.generateID());
//		}
	}
}