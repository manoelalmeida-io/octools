import styled from 'styled-components';

export const Container = styled.div`
  user-select: none;
  padding: 16px;
  margin: 0 0 8px 0;
  min-height: 50px;
  background-color: ${props => props.isDragging ? '#263B4A' : '#456C86'};
  color: white;
  border-radius: 7px;
  box-shadow: 2px 2px 2px 1px rgba(0, 0, 0, 0.1);
`;