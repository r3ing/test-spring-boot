package com.apps.auth;

public class JwtConfig {
	public static final String SECRET_KEY = "alguna.clave.secreta.12345";
	
	public static final String PRIVATE_RSA = "-----BEGIN RSA PRIVATE KEY-----\r\n" + 
			"MIIEpQIBAAKCAQEA2KIojStJUVaoDWfxPb1xQ3owsIc7yq4fZbkOwWfzVLWOuPrI\r\n" + 
			"5oWLZBWo7IJk6jdsLuf1UxcbPFmTkJjByQcYqk62pKxSkwO25am6w9Vd2o65XPt7\r\n" + 
			"p3w2I4D5+luADFM5doxbFK9nhidTvvEwkAmchCcSPEnJq+rXvkim9GCcKHsSgWeH\r\n" + 
			"/cbRV0JjCrozuaAd2RhmB8SeTpBEpHkbT9zklUwZ6UjVLZvF4gK/BV0YJ9kUfY2P\r\n" + 
			"LqGbsHGiw0lQbbcCF3jaE9/MWxZAiSsDEm+UTzJavkNdaEALm4Gc28t0FpajDPBn\r\n" + 
			"24J8AQ0ytQnaaZZHVMMvlz60pJDkECrW+sfWWwIDAQABAoIBAQDJR4GeCMYKiRWD\r\n" + 
			"vzvqPYZrR7DNlBj97GLHxPXsxYTVBAwj2v+nEBW/XFCjz1OsOuqNen/6P9HSdPgi\r\n" + 
			"tYv4GFvWgWQ6BNKEPkNFiDo7kpetZkbcGd1+dG5o9oFNGI8U5I7Tkv1dbswlXYz2\r\n" + 
			"MGsKqaN/Nj4/Pd/fmEf0SNS24ry07k65IqHGXGuSN2IYU/jJY6uu8ox8N/JvA6+E\r\n" + 
			"/QEJtSu2IsVybW7LWaDd7IC3Z1SzHO4EGofyntY25ENmRWduVdM1BQ2b6cOOAUxp\r\n" + 
			"1oP9Hgri2iSnB4ZePaGmBWy4tqzPW3MixAa2/ut7ms3iK6il1wegBAMLFbEWkf1z\r\n" + 
			"8lcXR2EhAoGBAPhymdgDOle99nZJ0OZgJ+iGJk/uTseEGL/EoKJNCml3Zp+624hg\r\n" + 
			"2EasFDUPl9bBzIHnKRATwrYVQJQ6YibIIjVS3HcZii5XIrZRtXtAhEBpVqSrquIB\r\n" + 
			"Jn4SCjq22BsuzDH17FBAue0v3GSMm28A76wcbWJ0GX+WWO9UIq+AszQfAoGBAN83\r\n" + 
			"+1UY6Q80nqC6Bk5i6ymXf27HZKh3IaR8pFUhM1sRMHs4DQCvMrz66pe7uB8IK/Kf\r\n" + 
			"gUC112BX/6gYBrQdw77ZQrnZQjrZO8Hd2P5PzNsd67Bq1Pc3ZBWz8vlrAuVzVZbR\r\n" + 
			"Ml2MmaEE287CXVJuBETajNigehA52EkySZeE+/ZFAoGADRr2dIePD0vM8WZpZ42Q\r\n" + 
			"7VoOMU8vxqR4Lb1wf78ymmea+TgBFouNPQUct8PPzZtBb2TDLL7uGW67jlYaEVOj\r\n" + 
			"Qk7RpFKrkFA2W4mp2guILmGgGWWYyP0oi6Pl+Dzm32AzkzsWsREI/bL1nDQyisNw\r\n" + 
			"4RJKztOy+KD0pgM5JSrTyR8CgYEAzWbkPZAolbdj6J6FQwg/QQyJVNTiSSsmqAeR\r\n" + 
			"6Ewex8PvitMvE9wjokZ6LJmuec+5MQ+ZjoRF5f/T30gMkx14jFu7zOygxyoylNih\r\n" + 
			"3pJr/Y1w3evQgJRV4qquANl51s3kil2CLRc+Hy8rXPz5hup5vyokxQoWiGvSHLjL\r\n" + 
			"g0P53skCgYEA1gmGHiSYAZeSph4slMMU803mje44eHDdlX/Db/Vx69dgaEcUKUBR\r\n" + 
			"eOcualeWfYVdzVZz5wlNBhsKRo/ChWQHMMYlAhkZ5VupC14Qe9iLxw+aerFSPW76\r\n" + 
			"EK6LBz4/ANw2DPNoEkuf17WN8RO9OOtdHmImfXKfjQJYe8ac/BDoG2U=\r\n" + 
			"-----END RSA PRIVATE KEY-----";
	
	public static final String PUBLIC_RSA = "-----BEGIN PUBLIC KEY-----\r\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA2KIojStJUVaoDWfxPb1x\r\n" + 
			"Q3owsIc7yq4fZbkOwWfzVLWOuPrI5oWLZBWo7IJk6jdsLuf1UxcbPFmTkJjByQcY\r\n" + 
			"qk62pKxSkwO25am6w9Vd2o65XPt7p3w2I4D5+luADFM5doxbFK9nhidTvvEwkAmc\r\n" + 
			"hCcSPEnJq+rXvkim9GCcKHsSgWeH/cbRV0JjCrozuaAd2RhmB8SeTpBEpHkbT9zk\r\n" + 
			"lUwZ6UjVLZvF4gK/BV0YJ9kUfY2PLqGbsHGiw0lQbbcCF3jaE9/MWxZAiSsDEm+U\r\n" + 
			"TzJavkNdaEALm4Gc28t0FpajDPBn24J8AQ0ytQnaaZZHVMMvlz60pJDkECrW+sfW\r\n" + 
			"WwIDAQAB\r\n" + 
			"-----END PUBLIC KEY-----";
}
