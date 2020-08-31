import styled from 'styled-components';

export const Container = styled.div`
  display: flex;
  flex-direction: column;
  align-items: center;

  > div {
    margin: 8px;
  }
`;

export const ColumnDropArea = styled.div`
  background: ${props => props.isDraggingOver ? 'lightblue' : 'lightgray'};
  padding: 4px;
  width: 250px;
  min-height: 500px;
  border-radius: 7px;
`;