package com.iolo.javaskill.NPE;

import java.util.Optional;

/**
 * Created by FengXinXin on 2018/6/22.
 */
public class NPE {
    public static void main(String[] args) {
        User user = new User("Admin",new Address("TJ"));
        User userAddressNull = new User("Admin",new Address());
        User userNull = null;
        try {
            /**
             * 例子一
             */
            System.out.println("User :            "+getCity(user));
            System.out.println("UserAddressNull : "+getCity(userAddressNull));
            System.out.println("UserNull :        "+getCity(userNull));

            System.out.println("8 User :            "+getCity8(user));
            System.out.println("8 UserAddressNull : "+getCity8(userAddressNull));
            System.out.println("8 UserNull :        "+getCity8(userNull));

            /**
             * 例子二
             */
            System.out.println("User :            "+getCity(user));
            System.out.println("UserAddressNull : "+getCity(userAddressNull));
            System.out.println("UserNull :        "+getCity(userNull));

            System.out.println("8 User :            "+getCity8(user));
            System.out.println("8 UserAddressNull : "+getCity8(userAddressNull));
            System.out.println("8 UserNull :        "+getCity8(userNull));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 旧版写法
     * @param user
     * @return
     * @throws Exception
     */
    public static String getCity(User user) throws Exception {
        if (user != null) {
            if (user.getAddress() != null) {
                Address address = user.getAddress();
                if (address.getCity() != null) {
                    return address.getCity();
                }
            }
        }
        throw new Exception("取值错误");
    }

    /**
     * 新版写法
     * @param user
     * @return
     * @throws Exception
     */
    public static String getCity8(User user) throws Exception {
        return Optional.ofNullable(user)
                .map(u -> u.getAddress())
                .map(a -> a.getCity())
                .orElseThrow(() -> new Exception("取值错误"));
    }

}
