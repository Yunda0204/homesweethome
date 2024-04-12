import { useEffect } from 'react';
import { MdOutlineAdd } from 'react-icons/md';

const AddTodo = ({ onSubmit, onChange, todo, message }) => {
  useEffect(() => {
    console.log('todo 값 변경 - 렌더링 후');

    return () => {
      console.log('뒷정리 함수.../ update');
    };
  }, [todo, message]); // [...] // 변화 감지 기준

  useEffect(() => {
    console.log('마운트시 한번만 호출');
    // DOMContentLoadef 비슷 (동일 X)
  }, []);

  return (
    <form onSubmit={onSubmit} autoComplete="off">
      <input type="text" value={todo ?? ''} onChange={onChange} />
      <button type="submit">
        <MdOutlineAdd />
      </button>

      {message && <div>{message}</div>}
    </form>
  );
};

export default AddTodo;
