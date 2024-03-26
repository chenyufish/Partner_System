/**
 * 用户实体
 */
export type userType ={
    id: number;
    username :string;
    userAccount: string;
    avatarUrl ?:string;
    gender :number;
    phone :string;
    email :string;
    profile ?: string;
    userStatus :string;
    userRole :string;
    planetCode :string;
    tags :string[];
    createTime: Date;
};
