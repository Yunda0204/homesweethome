import { useState } from 'react';

const Profile = () => {
  const [data, setData] = useState({
    //useState 정해진 함수, 상태값
    name: '이이름',
    age: 40,
  });

  const changeProfile = () => {
    // data.name = '박선화';
    // data.age = 30;                      주소가 같아서 밖에선 안바뀜 / 밖에선 바뀜

    // setData({ name: '박선화', age: 25 });  data가 아니라 setData로 주소를 변경해서 가능

    // setData({ ...data, name: '박선화' }); //...으로 data 내의 name 값을 변경

    setData((state) => {
      console.log('이전 상태값 : ', state);
      return { ...data, name: '이세현' };
    });
  };

  const { name, age } = data;
  return (
    <>
      <h1>{name}</h1>
      <h1>{age}</h1>
      <button type="button" onClick={changeProfile}>
        변경
      </button>
    </>
  );
};

export default Profile;
