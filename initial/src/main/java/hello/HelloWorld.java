package hello;

import java.time.LocalTime;

public class HelloWorld {
	public static void main(String[] args) {
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is:"+ currentTime);
		Greeter greeter = new Greeter();
		System.out.println(greeter.sayHello());
	}
}

//日付時間
// https://qiita.com/liguofeng29/items/c643c6f81afc62aac77d
// Date(非推奨)「GMT 1970年1月1日 0時0分0秒からの現在に至るミリ秒」
// Calendar
// Instant エポック秒(1970-01-01T00:00:00Zから経過時間)を表現する不変＆スレッドセーフクラス。
// LocalDate タイムゾーンなし日付(yyyy-mm-dd)を表現する不変＆スレッドセーフクラスです。誕生日などに使えます。
// LocalTime タイムゾーンなし(HH:mm:ss.SSSSSSSSS)を表現する不変＆スレッドセーフクラスです。
// LocalDateTime LocalDateとLocalTimeを内部で持っていて、タイムゾーンなし日付時間(yyyy-mm-dd HH:mm:ss.SSSSSSSSS)を表現する不変＆スレッドセーフクラスです。
// ZoneDateTime タイムゾーン付き(HH:mm:ss.SSSSSSSSS)を表現する不変＆スレッドセーフクラスです。基本的な使い方は、LocalTimeDateと変わらないようです。
// OffsetDateTime LocalDateTimeとOffsetを組み合わせたものです。
// YearMonth yyyy-mmを表現する不変＆スレッドセーフクラスです。
// YearDay mm-ddを表現する不変＆スレッドセーフクラスです。
// Year yyyyを表現する不変＆スレッドセーフクラスです。
// Month 月を表現する列挙体
// DayOfWeek 曜日を表す列挙体
// Clock タイムゾーン付システム時刻を表現するクラスです。日付時間クラスのnow()は、このClockを元に生成します。
// TemporalAmount
//	Duration 時間量を表現する不変＆スレッドセーフクラスです。
//	Period 時間量を表現する不変＆スレッドセーフクラスです。※ 単位はYears, Months, Days
// ZoneId 時間帯を表現するクラス
// DateFormat
// SimpleDateFormat
// DateTimeFormatter
//
//
//







