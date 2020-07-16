package com.skplanet.refactorexample.step07;

import lombok.Data;

@SuppressWarnings("unused")
// Extract Method
// Simplify or Cleanup code
// Move method
public class MoveMethod {

    enum MemberType {
        SUPER_ADMIN,
        ADMIN,
        USER,
    }

    static class MemberService {

        public void checkUserType(Member member) {
            if (member.getMemberType() == MemberType.USER) {
                System.out.println("Ok");
            } else {
                System.out.println("Error");
            }
        }
    }

    @Data
    private static class Member {

        private MemberType memberType;
    }
}
